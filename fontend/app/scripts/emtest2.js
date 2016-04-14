/**
 * Created by echao on 2016/4/14.
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
  if (parseInt(arr[2]) <= 8) {
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
  console.log(correctrate1);
}
//对了加1，错了加0，可能加2
function isTrue(url, choose) {
  'use strict';
  var arr = url.split(/[//.]/);
  if (parseInt(arr[2]) <= 16){
    if (choose === 'yes') {
      //right
      correctrate2 += '1';
    } else if (choose === 'maybe') {
      correctrate2 += '2';
    } else{
      correctrate2 += '0';
    }
  }else {
    if (choose === 'no') {
      //right
      correctrate2 += '1';
    } else{
      //wrong
      correctrate2 += '0';
    }
  }
  console.log(correctrate2);
  }


function countDownTime(currentTime, picUrl) {
  'use strict';
  if (picUrl === '0') {
    timedown = setInterval(function () {
      if (currentTime <= 0) {
        clearInterval(timedown);
        endtest1();
      }
      $('#timedown').text(currentTime);
      currentTime--;
    }, 1000);
  } else {
    timedown = setInterval(function () {
      if (currentTime <= 0) {
        clearInterval(timedown);
        recodeTime('8000');
        $('#pictureurl').attr('src', picUrl);
      }
      $('#timedown').text(currentTime);
      currentTime--;
    }, 1000);
  }
}

$(document).ready(function ($){
  'use strict';
  var urls1 = [
    'images/emtest2/1.bmp',
    'images/emtest2/2.bmp',
    'images/emtest2/3.bmp',
    'images/emtest2/4.bmp',
    'images/emtest2/5.bmp',
    'images/emtest2/6.bmp',
    'images/emtest2/7.bmp',
    'images/emtest2/8.bmp',
    'images/emtest2/9.bmp',
    'images/emtest2/10.bmp',
    'images/emtest2/11.bmp',
    'images/emtest2/12.bmp',
    'images/emtest2/13.bmp',
    'images/emtest2/14.bmp',
    'images/emtest2/15.bmp',
    'images/emtest2/16.bmp'
    ];
  var urls2 = [
    'images/emtest2/1.bmp',
    'images/emtest2/2.bmp',
    'images/emtest2/3.bmp',
    'images/emtest2/4.bmp',
    'images/emtest2/5.bmp',
    'images/emtest2/6.bmp',
    'images/emtest2/7.bmp',
    'images/emtest2/8.bmp',
    'images/emtest2/9.bmp',
    'images/emtest2/10.bmp',
    'images/emtest2/11.bmp',
    'images/emtest2/12.bmp',
    'images/emtest2/13.bmp',
    'images/emtest2/14.bmp',
    'images/emtest2/15.bmp',
    'images/emtest2/16.bmp',
    'images/emtest2/17.bmp',
    'images/emtest2/18.bmp',
    'images/emtest2/19.bmp',
    'images/emtest2/20.bmp',
    'images/emtest2/21.bmp',
    'images/emtest2/22.bmp',
    'images/emtest2/23.bmp',
    'images/emtest2/24.bmp',
    'images/emtest2/25.bmp',
    'images/emtest2/26.bmp',
    'images/emtest2/27.bmp',
    'images/emtest2/28.bmp',
    'images/emtest2/29.bmp',
    'images/emtest2/30.bmp',
    'images/emtest2/31.bmp',
    'images/emtest2/32.bmp'
  ];
  var flag = 0;
  var time1;
  var time2;


  $('#pictureurl').load(function () {
    var d1 = new Date();
    time1 = d1.getTime();
    flag++;
    countDownTime(8, urls1[flag]);
    console.log(flag);
    console.log(usetime);
  });

  function clickChangePic(para) {
    var d2 = new Date();
    time2 = d2.getTime();
    var usetime1 = time2 - time1;
    var url = $('#pictureurl').attr('src');
    isChooseTrue(url, para);
    recodeTime(usetime1);
    clearInterval(timedown);
    if (urls1[flag] !== '0') {
      $('#pictureurl').attr('src', urls1[flag]);
    } else {
      endtest1(usetime1);
    }
  }

  $('#teststart1').click(function () {
    urls1.sort(function () {
      return 0.5 - Math.random();
    });//打乱顺序
    $('#description1').hide();
    $('#testcontent').show();
    $('#in').show();
    $('#out').show();
    $('#yes').hide();
    $('#maybe').hide();
    $('#no').hide();
    urls1[16] = '0';
    $('#pictureurl').attr('src', urls1[0]);
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
    var url = $('#pictureurl').attr('src');
    isTrue(url, para);
    recodeTime(usetime2);
    clearInterval(timedown);
    if (urls2[flag] !== '0') {
      $('#pictureurl').attr('src', urls2[flag]);
    } else {
      endtest2(usetime2);
    }
  }

//第二次开始测试
  $('#teststart2').click(function () {
    urls2.sort(function () {
      return 0.5 - Math.random();
    });//打乱顺序
    flag = 0;
    $('#description2').hide();
    $('#testcontent').show();
    $('#in').hide();
    $('#out').hide();
    $('#yes').show();
    $('#maybe').show();
    $('#no').show();
    urls2[32] = '0';
    $('#pictureurl').attr('src', urls2[0]);
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
