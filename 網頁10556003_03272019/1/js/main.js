// JavaScript Document
var isOpen=true;
$(function(){
	$('.logo').mousedown(function(){
		if(isOpen){
			$(this).parent().stop().animate({top:-80},{duration:1000,easing:'easeInSine'});
			 $(this).stop().animate({top:40},{duration:800})
			  $(this).rotate({angle: 0,animateTo:180})
			isOpen=false;
	}else{
		$(this).parent().stop().animate({top:0},{duration:1000,easing:'easeInSine'});
		 $(this).stop().animate({top:20},{duration:800})
		  $(this).rotate({angle: 180,animateTo:0})
		isOpen=true;
		
		}
		
	});
});