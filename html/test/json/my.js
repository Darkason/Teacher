// myweb 部分
// 1. 创建回调函数callback
function myCallback(res) {
    alert(JSON.stringify(res, null, 2));
}

document.getElementById('btn-4').addEventListener('click', function () {
    // 2. 动态创建script标签，并设置src属性，注意参数cb=myCallback
    var script = document.createElement('script');
    script.src = 'http://127.0.0.1:3000/info/jsonp?cb=myCallback';
    document.getElementsByTagName('head')[0].appendChild(script);
});
