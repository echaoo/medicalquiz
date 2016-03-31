/**
 * Created by skyADMIN on 16/3/23.
 */

$(document).ready(function ($) {
  'use strict';

  $('#pictureurl').load(function () {
    countDownTime(8, "images/watch.jpg");
  });

});

function countDownTime(currentTime, picUrl) {
  var timedown = setInterval(function () {
    if (currentTime <= 0) {
      clearInterval(timedown);
      $('#pictureurl').attr("src", picUrl);
    }
    $('#timedown').text(currentTime);
    currentTime--;
  }, 1000);
}
