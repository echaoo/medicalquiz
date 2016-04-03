/**
 * Created by skyADMIN on 16/3/23.
 */

var timedown;

function fillForm(val) {
  var now = $('#emtestresult1').val();
  now = now + val;
  $('#emtestresult1').val(now);
}

function isChooseTrue(url, choose) {
  var arr = url.split(/[//.]/);
  if (parseInt(arr[2]) <= 20){
    if (choose == 'in'){
      //right
      fillForm("1");
    }else {
      //wrong
      fillForm("2");
    }
  }else{
    if (choose == "in"){
      //wrong
      fillForm("2");
    }else {
      //right
      fillForm("1");
    }
  }
}

function countDownTime(currentTime, picUrl) {
  'use strict';

  timedown = setInterval(function () {
    if (currentTime <= 0) {
      fillForm("0");
      clearInterval(timedown);
      $('#pictureurl').attr('src', picUrl);
    }
    $('#timedown').text(currentTime);
    currentTime--;
  }, 1000);
}

$(document).ready(function ($) {

  'use strict';

  var urls = [
    'images/emtest1/1.bmp',
    'images/emtest1/2.bmp',
    'images/emtest1/3.bmp',
    'images/emtest1/4.bmp',
    'images/emtest1/5.bmp',
    'images/emtest1/6.bmp',
    'images/emtest1/7.bmp',
    'images/emtest1/8.bmp',
    'images/emtest1/9.bmp',
    'images/emtest1/10.bmp',
    'images/emtest1/11.bmp',
    'images/emtest1/12.bmp',
    'images/emtest1/13.bmp',
    'images/emtest1/14.bmp',
    'images/emtest1/15.bmp',
    'images/emtest1/16.bmp',
    'images/emtest1/17.bmp',
    'images/emtest1/18.bmp',
    'images/emtest1/19.bmp',
    'images/emtest1/20.bmp',
    'images/emtest1/21.bmp',
    'images/emtest1/22.bmp',
    'images/emtest1/23.bmp',
    'images/emtest1/24.bmp',
    'images/emtest1/25.bmp',
    'images/emtest1/26.bmp',
    'images/emtest1/27.bmp',
    'images/emtest1/28.bmp',
    'images/emtest1/29.bmp',
    'images/emtest1/30.bmp',
    'images/emtest1/31.bmp',
    'images/emtest1/32.bmp',
    'images/emtest1/33.bmp',
    'images/emtest1/34.bmp',
    'images/emtest1/35.bmp',
    'images/emtest1/36.bmp',
    'images/emtest1/37.bmp',
    'images/emtest1/38.bmp',
    'images/emtest1/39.bmp',
    'images/emtest1/40.bmp'
  ];
  var flag = 1;
  var time1;
  var time2;

  urls.sort(function () {
    return 0.5 - Math.random();
  });//打乱顺序

  $('#pictureurl').load(function () {
    var d1 = new Date();
    time1 = d1.getTime();
    countDownTime(8, urls[flag]);
    flag++;
  });

  $('#teststart').click(function () {
    $('#description').hide();
    $('#testcontent').show();
    $('#pictureurl').attr('src', urls[0]);
  });

  $('#in').click(function () {
    var d2 = new Date();
    time2 = d2.getTime();
    var time = time2 - time1;
    var url = $('#pictureurl').attr('src');
    isChooseTrue(url,"in");
    clearInterval(timedown);
    $('#pictureurl').attr('src',urls[flag]);
    flag++;
  });

  $('#out').click(function () {
    var d2 = new Date();
    time2 = d2.getTime();
    var time = time2 - time1;
    var url = $('#pictureurl').attr('src');
    isChooseTrue(url,"out");
    clearInterval(timedown);
    $('#pictureurl').attr('src',urls[flag]);
    flag++;
  });

});

