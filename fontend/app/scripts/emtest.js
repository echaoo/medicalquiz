/**
 * Created by skyADMIN on 16/3/23.
 */

var timedown;
var correctrate1 = "";
var correctrate2 = "";
function postresult(url,correctrate) {
  $.post(url, {correct: correctrate, time: '2px'});
}

function endtest1() {
  var url1 = '/saveemtest1';
  var correctrate = correctrate1;
  postresult(url1, correctrate);
  $('#testcontent').hide();
  $('#over1').show();
}

function endtest2() {
  var correctrate = correctrate2;
  var url2 = '/saveemtest2';
  postresult(url2, correctrate);
  $('#testcontent').hide();
  $('#over2').show();
}

function isChooseTrue(url, choose) {
  var arr = url.split(/[//.]/);
  if (parseInt(arr[2]) <= 20) {
    if (choose == 'in') {
      //right
      correctrate1 += "1";
    } else {
      //wrong
      correctrate1 += "2";
    }
  } else {
    if (choose == "in") {
      //wrong
      correctrate1 += "2";
    } else {
      //right
      correctrate1 += "1";
    }
  }
}
function isTrue(choose) {
  if (choose == "yes") {
    correctrate2 += 1;
  } else if (choose == "maybe") {
    correctrate2 += 2;
  } else correctrate2 += 0;
}
function countDownTime(currentTime, picUrl) {
  'use strict';
  if (picUrl == '0') {
    timedown = setInterval(function () {
      if (currentTime <= 0) {
        fillForm("0");
        clearInterval(timedown);
        endtest1();
      }
      $('#timedown').text(currentTime);
      currentTime--;
    }, 1000);
  } else {
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
    'images/emtest1/40.bmp',
  ];
  var flag = 0;
  var time1;
  var time2;

  function clickChangePic(para) {
    var d2 = new Date();
    time2 = d2.getTime();
    var time = time2 - time1;
    var url = $('#pictureurl').attr('src');
    isChooseTrue(url, para);
    clearInterval(timedown);
    if (urls[flag] != '0') {
      $('#pictureurl').attr('src', urls[flag]);
    } else {
      endtest1();
    }
  }

  $('#pictureurl').load(function () {
    var d1 = new Date();
    time1 = d1.getTime();
    flag++;
    countDownTime(8, urls[flag]);
    console.log(flag);
  });

  $('#teststart1').click(function () {
    urls.sort(function () {
      return 0.5 - Math.random();
    });//打乱顺序
    $('#description1').hide();
    $('#testcontent').show();
    $('#in').show();
    $('#out').show();
    $('#yes').hide();
    $('#maybe').hide();
    $('#no').hide();
    urls[40] = '0';
    $('#pictureurl').attr('src', urls[0]);
  });

  $('#in').click(function () {
    clickChangePic("in")
  });

  $('#out').click(function () {
    clickChangePic("out")
  });

//显示第二次测试
  $('#teststart3').click(function () {
    $('#over1').hide();
    $('#description2').show();
  });

  function recheck(para) {
    var d2 = new Date();
    time2 = d2.getTime();
    var time = time2 - time1;
    var url = $('#pictureurl').attr('src');
    isTrue(para);
    clearInterval(timedown);
    if (urls[flag] != '0') {
      $('#pictureurl').attr('src', urls[flag]);
    } else {
      endtest2();
    }
  }

//第二次开始测试
  $('#teststart2').click(function () {
    flag = 0;
    $('#description2').hide();
    $('#testcontent').show();
    $('#in').hide();
    $('#out').hide();
    $('#yes').show();
    $('#maybe').show();
    $('#no').show();
    urls[40] = '0';
    $('#pictureurl').attr('src', urls[0]);
  });

  //第二次测试按钮事件
  $('#yes').click(function () {
    recheck("yes");
  });

  $('#maybe').click(function () {
    recheck("maybe");
  });
  $('#no').click(function () {
    recheck("no");
  });

});

