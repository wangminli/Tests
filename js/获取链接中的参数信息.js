//获取链接中的参数
      function getLocationParam( name)
     {
          var reg = new RegExp( "(^|&)" + name +"=([^&]*)(&|$)" );
          var r = window.location.search.substr(1).match(reg);
          if(r!= null) return  unescape(r[2]); return null;
     }

使用

getLocationParam("type")
