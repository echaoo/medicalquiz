/**
 * Created by skyADMIN on 16/3/23.
 */

var timedown;
var correctrate1 = '';
var correctrate2 = '';
var usetime = '';

function postresult(url, correctrate, time) {
  'use strict';
  $.post(url, {correct: correctrate, time: time});
}

function clearTime() {
  'use strict';
  usetime = '';
}

function recodeTime(usertime) {
  'use strict';
  usetime += (usertime + ';');
  return usetime;
}

function endtest1(paratime) {
  'use strict';
  var url1 = '/saveemtest1';
  var correctrate = correctrate1;
  var time = recodeTime(paratime);
  postresult(url1, correctrate, time);
  clearTime();
  $('#testcontent').hide();
  $('#over1').show();
}

function endtest2(paratime) {
  'use strict';
  var correctrate = correctrate2;
  var url2 = '/saveemtest2';
  var time = recodeTime(paratime);
  postresult(url2, correctrate, time);
  clearTime();
  $('#testcontent').hide();
  $('#over2').show();
}

function isChooseTrue(url, choose) {
  'use strict';
  var arr = url.split(/[//.]/);
  if (parseInt(arr[2]) <= 20) {
    if (choose === 'in') {
      //right
      correctrate1 += '1';
    } else {
      //wrong
      correctrate1 += '2';
    }
  } else {
    if (choose === 'in') {
      //wrong
      correctrate1 += '2';
    } else {
      //right
      correctrate1 += '1';
    }
  }
}
function isTrue(choose) {
  'use strict';
  //对了加1，错了加0，可能加2
  if (choose === 'yes') {
    correctrate2 += '1';
  } else if (choose === 'maybe') {
    correctrate2 += '2';
  } else {
    correctrate2 += '0';
  }
}
function countDownTime(currentTime, picUrl) {
  'use strict';
  if (picUrl === '0') {
    timedown = setInterval(function () {
      if (currentTime <= 0) {
        correctrate1 += '2';
        endtest1(8000);
        clearInterval(timedown);
      }
      $('#timedown').text(currentTime);
      currentTime--;
    }, 1000);
  } else {
    timedown = setInterval(function () {
      if (currentTime <= 0) {
        recodeTime('8000');
        correctrate1 += '2';
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
    'images/emtest1/1.jpeg',
    'images/emtest1/2.jpeg',
    'images/emtest1/3.jpeg',
    'images/emtest1/4.jpeg',
    'images/emtest1/5.jpeg',
    'images/emtest1/6.jpeg',
    'images/emtest1/7.jpeg',
    'images/emtest1/8.jpeg',
    'images/emtest1/9.jpeg',
    'images/emtest1/10.jpeg',
    'images/emtest1/11.jpeg',
    'images/emtest1/12.jpeg',
    'images/emtest1/13.jpeg',
    'images/emtest1/14.jpeg',
    'images/emtest1/15.jpeg',
    'images/emtest1/16.jpeg',
    'images/emtest1/17.jpeg',
    'images/emtest1/18.jpeg',
    'images/emtest1/19.jpeg',
    'images/emtest1/20.jpeg',
    'images/emtest1/21.jpeg',
    'images/emtest1/22.jpeg',
    'images/emtest1/23.jpeg',
    'images/emtest1/24.jpeg',
    'images/emtest1/25.jpeg',
    'images/emtest1/26.jpeg',
    'images/emtest1/27.jpeg',
    'images/emtest1/28.jpeg',
    'images/emtest1/29.jpeg',
    'images/emtest1/30.jpeg',
    'images/emtest1/31.jpeg',
    'images/emtest1/32.jpeg',
    'images/emtest1/33.jpeg',
    'images/emtest1/34.jpeg',
    'images/emtest1/35.jpeg',
    'images/emtest1/36.jpeg',
    'images/emtest1/37.jpeg',
    'images/emtest1/38.jpeg',
    'images/emtest1/39.jpeg',
    'images/emtest1/40.jpeg'
  ];
  var flag = 0;
  var time1;
  var time2;


  $('#pictureurl').load(function () {
    var d1 = new Date();
    time1 = d1.getTime();
    flag++;
    countDownTime(8, urls[flag]);
    console.log(flag);
    console.log(usetime);
    console.log(correctrate1);
  });

  function clickChangePic(para) {
    var d2 = new Date();
    time2 = d2.getTime();
    var usetime1 = time2 - time1;
    var url = $('#pictureurl').attr('src');
    isChooseTrue(url, para);
    recodeTime(usetime1);
    clearInterval(timedown);
    if (urls[flag] !== '0') {
      $('#pictureurl').attr('src', urls[flag]);
    } else {
      endtest1(usetime1);
    }
  }

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
    clickChangePic('in');
  });

  $('#out').click(function () {
    clickChangePic('out');
  });

//显示第二次测试
  $('#teststart3').click(function () {
    $('#over1').hide();
    $('#description2').show();
  });

  function recheck(para) {
    var d2 = new Date();
    time2 = d2.getTime();
    var usetime2 = time2 - time1;
    //var url = $('#pictureurl').attr('src');
    isTrue(para);
    recodeTime(usetime2);
    clearInterval(timedown);
    if (urls[flag] !== '0') {
      $('#pictureurl').attr('src', urls[flag]);
    } else {
      endtest2(usetime2);
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
    recheck('yes');
  });

  $('#maybe').click(function () {
    recheck('maybe');
  });
  $('#no').click(function () {
    recheck('no');
  });

});

