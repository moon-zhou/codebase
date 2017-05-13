// 传入了一个把公共变量“jQuery”传入了一个即时执行的函数里面，在函数局部（容器）中我们可以通过“$”来引用它
;(function($) {
    // 局部作用域中使用$来引用jQuery
    
    
    // 在我们插件容器内，创造一个公共变量来构建一个私有方法
	var privateFunction = function() {
		// 代码在这里运行
	}
	
	var methods = {
	        
	    // 在字面量对象中定义每个单独的方法
		init : function(options) {
			return this.each(function() {
				var $this = $(this);
				var settings = $this.data('pluginName');

				if (typeof (settings) == 'undefined') {

					var defaults = {
						propertyName : 'value',
						onSomeEvent : function() {
						}
					}

					settings = $.extend({}, defaults, options);

					$this.data('pluginName', settings);
				} else {
					settings = $.extend({}, settings, options);
				}

				// 代码在这里运行
				// 例如： privateFunction();

			});
		},
		destroy : function(options) {
			return $(this).each(function() {
				var $this = $(this);

				$this.removeData('pluginName');
			});
		},
		val : function(options) {
			var someValue = this.eq(0).html();

			return someValue;
		},
		reposition: function() {
			//...
		},
		show: function() {
			//...
		},
		hide: function() {
			//...
		},
		update: function(content) {
			//...
		}
	};
	
	// 向jQuery中被保护的“fn”命名空间中添加你的插件代码，用“pluginName”作为插件的函数名称
	$.fn.pluginName = function(method) {
	    // 检验方法是否存在
        if (methods[method]) {
            return methods[method].apply(this, Array.prototype.slice.call(arguments, 1));
        } else if (typeof method === 'object' || !method) {
            // 如果方法不存在，检验对象是否为一个对象（JSON对象）或者method方法没有被传入
            // 如果我们传入的是一个对象参数，或者根本没有参数，init方法会被调用
            return methods.init.apply(this, arguments);
        } else {
            // 如果方法不存在或者参数没传入，则报出错误。需要调用的方法没有被正确调用
            $.error('Method ' + method + ' does not exist on jQuery.tooltip');
        }
	};
	

	/**
	 * 默认值
	 */
	var defaults = {
        attr1 : 'attr1',
        attr2 : 'attr2'
    };
	
})(jQuery);