/**
 * Created by echao on 2016/3/14.
 */
$(document).ready(function(){
  var ans1;
      $("input[type=radio]").click(function (){
        var a1 = parseInt($("input[name='ques1']:checked").val()==null?0:$("input[name='ques1']:checked").val());
        var a2 = parseInt($("input[name='ques2']:checked").val()==null?0:$("input[name='ques2']:checked").val());
        var a3 = parseInt($("input[name='ques3']:checked").val()==null?0:$("input[name='ques3']:checked").val());
        var a4 = parseInt($("input[name='ques4']:checked").val()==null?0:$("input[name='ques4']:checked").val());
        ans1 = a1+a2+a3+a4;
        $("#sumans").text(ans1);
      })
})
