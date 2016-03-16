/**
 * Created by echao on 2016/3/14.
 */
$(document).ready(function () {
  'use strict';
  $('input[type=radio]').click(function () {
    var a1 = parseInt($('input[name="ques1"]:checked').val() == null ? 0 : $('input[name="ques1"]:checked').val());
    var a2 = parseInt($('input[name="ques2"]:checked').val() == null ? 0 : $('input[name="ques2"]:checked').val());
    var a3 = parseInt($('input[name="ques3"]:checked').val() == null ? 0 : $('input[name="ques3"]:checked').val());
    var a4 = parseInt($('input[name="ques4"]:checked').val() == null ? 0 : $('input[name="ques4"]:checked').val());
    var a5 = parseInt($('input[name="ques5"]:checked').val() == null ? 0 : $('input[name="ques5"]:checked').val());
    var a6 = parseInt($('input[name="ques6"]:checked').val() == null ? 0 : $('input[name="ques6"]:checked').val());
    var a7 = parseInt($('input[name="ques7"]:checked').val() == null ? 0 : $('input[name="ques7"]:checked').val());
    var a8 = parseInt($('input[name="ques8"]:checked').val() == null ? 0 : $('input[name="ques8"]:checked').val());
    var a9 = parseInt($('input[name="ques9"]:checked').val() == null ? 0 : $('input[name="ques9"]:checked').val());
    var a10 = parseInt($('input[name="ques10"]:checked').val() == null ? 0 : $('input[name="ques10"]:checked').val());
    var a11 = parseInt($('input[name="ques11"]:checked').val() == null ? 0 : $('input[name="ques11"]:checked').val());
    var a12 = parseInt($('input[name="ques12"]:checked').val() == null ? 0 : $('input[name="ques12"]:checked').val());
    var a13 = parseInt($('input[name="ques13"]:checked').val() == null ? 0 : $('input[name="ques13"]:checked').val());
    var a14 = parseInt($('input[name="ques14"]:checked').val() == null ? 0 : $('input[name="ques14"]:checked').val());
    var a15 = parseInt($('input[name="ques15"]:checked').val() == null ? 0 : $('input[name="ques15"]:checked').val());
    var a16 = parseInt($('input[name="ques16"]:checked').val() == null ? 0 : $('input[name="ques16"]:checked').val());
    var a17 = parseInt($('input[name="ques17"]:checked').val() == null ? 0 : $('input[name="ques17"]:checked').val());
    var a18 = parseInt($('input[name="ques18"]:checked').val() == null ? 0 : $('input[name="ques18"]:checked').val());
    var a19 = parseInt($('input[name="ques19"]:checked').val() == null ? 0 : $('input[name="ques19"]:checked').val());
    var a20 = parseInt($('input[name="ques20"]:checked').val() == null ? 0 : $('input[name="ques20"]:checked').val());
    var ans = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20;
    $('#sumans').text(ans);
  });

});
