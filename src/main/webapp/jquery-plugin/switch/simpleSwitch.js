// 传入了一个把公共变量“jQuery”传入了一个即时执行的函数里面，在函数局部（容器）中我们可以通过“$”来引用它
/**
 * 
 * 开关按钮插件 版权所有周敏 ayimin1989@163.com
 * 
 * @param width number  The width of switchbutton.  60
 * @param height    number  The height of switchbutton. 26
 * @param disabled  boolean Defines if to disable the button.   false
 * @param readonly  boolean Defines if the button is read-only. false
 * @param reversed  boolean Set to true the onText value and offText value will switch their positions. false
 * @param onText    string  The text value of the left side.    ON
 * @param offText   string  The text value of the right side.   OFF
 * @param value string  The default value bound to the button.  on
 * 
 * @funciton onChange   checked Fires when the checked value is changed.
 * @funciton onClick
 * @funciton offClick
 * 
 * @method options  none    Return the options object.
 * @method resize   param   Resize the switchbutton.
 * @method disable  none    Disable the switchbutton. Code example: $('#sb').switchbutton('disable');
 * @method enable   none    Enable the switchbutton. Code example: $('#sb').switchbutton('enable');
 * @method readonly mode    Enable/Disable readonly mode.
 * @method check    none    Check the switchbutton.
 * @method uncheck  none    Uncheck the switchbutton.
 * @method clear    none    Clear the switchbutton's 'checked' value.
 * @method reset    none    Reset the switchbutton's 'checked' value.
 * @method setValue value   Set the switchbutton value.
 * 
 * @author zhoumin ayimin1989@163.com
 * 
 */

;(function($) {
    // 局部作用域中使用$来引用jQuery
    
    
    // 在我们插件容器内，创造一个公共变量来构建一个私有方法
	var privateFunction = function() {
		// 代码在这里运行
	}
 
	// 通过字面量创造一个对象，存储我们需要的共有方法
	var methods = {
	        
	    // 在字面量对象中定义每个单独的方法
		init: function(options) {
		    
		    // 返回“this”（函数each（）的返回值也是this），以便进行链式调用。
			return this.each(function() {
				var $this = $(this);
				var settings = $this.data('pluginName');
 
				if(typeof(settings) == 'undefined') {
 
					settings = $.extend({}, SIMPLESWITCH_DEFAULTS, options);
 
					$this.data('pluginName', settings);
				} else {
					settings = $.extend({}, settings, options);
				}
 
				// 代码在这里运行
				// 例如： privateFunction();
			});
		},
		destroy: function(options) {
			return $(this).each(function() {
				var $this = $(this);
 
				$this.removeData('pluginName');
			});
		},
		val: function(options) {
			var someValue = this.eq(0).html();
 
			return someValue;
		},
		onClick: function(){
		    
		},
		offClick: function(){
		    
		},
		onChange: function(){
		    
		}
	};
 
	// 向jQuery中被保护的“fn”命名空间中添加你的插件代码，用“pluginName”作为插件的函数名称
	$.fn.simpleSwitch = function() {
		
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
 
	}
	
	/**
	 * 开关默认的参数
	 */
	$.fn.simpleSwitch.SIMPLESWITCH_DEFAULTS = {
	        
	};
 
})(jQuery);