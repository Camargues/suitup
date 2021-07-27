// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';

var date = new Date();
var now = date.getMonth()+1;
var oneAgo = date.getMonth(); // 값 6
var twoAgo = date.getMonth()-1; // 값 6
var threeAgo = date.getMonth()-2; // 값 6
var fourAgo = date.getMonth()-3; // 값 6
var fiveAgo = date.getMonth()-4; // 값 6

var oneAgoSum = 0000;
var twoAgoSum = 0000;
var threeAgoSum = 0000;
var fourAgoSum = 0000;
var fiveAgoSum = 0000;

$.ajax({
    url: "getMonthSum.do",
    type: "post",
    dataType:"json",
    success: function (data) {
    	alert(data);
    },
    error : function(){
    	alert("error")
    }
  });

// Bar Chart Example
var ctx = document.getElementById("myBarChart");
var myLineChart = new Chart(ctx, {
  type: 'bar',
  data: {
    labels: [fiveAgo+"월", fourAgo+"월", threeAgo+"월", twoAgo+"월", oneAgo+"월", now+"월"],
    datasets: [{
      label: "Revenue",
      backgroundColor: "rgba(2,117,216,1)",
      borderColor: "rgba(2,117,216,1)",
      data: [4215, 5312, 6251, 7841, 9821, oneAgoSum],
    }],
  },
  options: {
    scales: {
      xAxes: [{
        time: {
          unit: 'month'
        },
        gridLines: {
          display: false
        },
        ticks: {
          maxTicksLimit: 6
        }
      }],
      yAxes: [{
        ticks: {
          min: 0,
          max: 15000,
          maxTicksLimit: 5
        },
        gridLines: {
          display: true
        }
      }],
    },
    legend: {
      display: false
    }
  }
});
