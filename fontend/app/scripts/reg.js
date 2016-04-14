/**
 * Created by skyADMIN on 16/3/14.
 */

function step1() {
  'use strict';
  $('.progress-bar').css('width', '30%');
  $('#regprogresstitle').text('注册进度:1/3');
  $('#page2').hide();
  $('#page3').hide();
  $('#page1').show();
}

function step2() {
  'use strict';
  window.scroll(0, 0);
  $('.progress-bar').css('width', '60%');
  $('#regprogresstitle').text('注册进度:2/3');
  $('#page1').hide();
  $('#page3').hide();
  $('#page2').show();
}

function step3() {
  'use strict';
  $('.progress-bar').css('width', '100%');
  $('#regprogresstitle').text('注册进度:3/3');
  $('#page1').hide();
  $('#page2').hide();
  $('#page3').show();
}

$(document).ready(function ($) {
  'use strict';

  $('#lastpage1').click(function () {
    step1();
  });

  $('#nextpage1').click(function () {
    step2();
  });

  $('#nextpage2').click(function () {
    step3();
  });

  $('#lastpage2').click(function () {
    step2();
  });

  $('#hyperselect').change(function () {
    var choose = $('#hyperselect').val();
    if (choose === 'y') {
      $('#hyper').show();
    } else {
      $('#hyper').hide();
    }
  });

  $('#diabetes').change(function () {
    var choose = $('#diabetes').val();
    if (choose === 'y') {
      $('#diabetestime').show();
    } else {
      $('#diabetestime').hide();
    }
  });

  $('#hyperlipemia').change(function () {
    var choose = $('#hyperlipemia').val();
    if (choose === 'y') {
      $('.hyperlipemiatime').show();
    } else {
      $('.hyperlipemiatime').hide();
    }
  });

  $('#angiocardiopathy').change(function () {
    var choose = $('#angiocardiopathy').val();
    if (choose === 'y') {
      $('#angiocardiopathytype').show();
    } else {
      $('#angiocardiopathytype').hide();
    }
  });

  $('#ACVD').change(function () {
    var choose = $('#ACVD').val();
    if (choose === 'y') {
      $('#ACVDtype').show();
    } else {
      $('#ACVDtype').hide();
    }
  });

});
