//切换tab，同时改变其他tab的状态
$(".banner ul li").eq($key).stop().fadeIn(2000).siblings().stop().fadeOut(2000);
