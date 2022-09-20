function submit(url, form) {
//    2异步发送请求到服务器
    sendUrl(url, form.serialize());
}

//发送请求
function sendUrl(url, param) {
    $.post(url, param, function (data) {
        responseClient(data)
    })
}
function sendUrlDel(url,param){
    $.post(url, param, function (data) {
        layer.msg(data.message, {icon: 2, time: 1000})
    window.location.reload();
    })
}

//响应用户
function responseClient(data) {

    if (data.code === 200) {
        layer.msg(data.message, {icn: 1, time: 1000}, function () {
            var index = parent.layer.getFrameIndex(window.name);
            parent.layer.close(index);
            window.location.reload();
        })
    } else {
        layer.msg(data.message, {icon: 2, time: 1000})
    }
}

//ifram弹出层
function layer_show(title, url, w, h) {
    if (title == null || title === '') {
        title = false;
    }
    if (url == null || url === '') {
        url = "error.jsp";
    }
    if (w == null || w === '') {
        w = 800;
    }
    if (h == null || h ==='') {
        h = ($(window).height() - 50);
        console.log(h)
    }
    layer.open({
        type: 2, //弹框类型ifram
        area: [w + 'px', h + 'px'],
        fix: false,//不固定
        maxmin: true,//是否最大化
        shade: 0.4,//透明度
        title: title,
        content: url,
        end: function () {
            location.reload();//刷新页面
        },
        cancel: function (index) {
            //手动关闭时调用的方法
        }
    })
}
