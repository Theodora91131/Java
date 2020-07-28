// JavaScript Document
var isOpened=true;

$(function(){
	$('.thumbnail').mouseenter(function(){
			$(this).stop().animate({top:-20},{duration:500,easing:'easeInOutCirc'});
		});
	$('.thumbnail').mouseleave(function(){
			$(this).stop().animate({top:0},{duration:50});
		});
	$('.logo').mousedown(function(){
			$(this).parent().stop().animate({top:-80},{duration:800 ,easing:'easeInOutCirc'});
		});
	$('.logo').mousedown(function(){
			$(this).parent().stop().animate({top:0},{duration:500 ,easing:'easeInOutCirc'});
		});
		
	 $('.header .logo').mousedown(function(){
        if(isOpened){
            //將導覽列收回
            $(this).parent().stop().animate({marginTop:-80}, {duration:400, easing:'easeOutBounce'});
            $(this).stop().animate({top:40}, {duration:400, easing:'easeOutBounce'});	
            isOpened=false;
        }else{
            //將導覽列打開
            $(this).parent().stop().animate({marginTop:0}, {duration:400, easing:'easeOutBounce'});
            $(this).stop().animate({top:20}, {duration:400, easing:'easeOutBounce'});
            isOpened=true;	
        }
    });
	
	});