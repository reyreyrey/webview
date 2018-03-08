# webview

[![](https://jitpack.io/v/reyreyrey/webview.svg)](https://jitpack.io/#reyreyrey/webview)
</br>

##引入
<p>在项目的build.gradle中添加如下代码</p>
<pre>
  <code>
    allprojects{
      repositories {
          jcenter()
          maven { url "https://jitpack.io" }
      }
    }
  </code>
</pre>

<p>在Module的build.gradle中添加如下代码</p>
<pre>
  <code>
  //加号替换为jitpack版本号
    compile 'com.github.reyreyrey:webview:+'
  </code>
</pre>

##使用
布局中加入以下</br>
<cn.webview.x5.ProgressWebView </br>
        android:id="@+id/webviewa"</br>
        android:layout_width="match_parent"</br>
        android:layout_height="match_parent" /></br>
<pre>
  <code>
        webView = findViewById(R.id.webview);
        webView.getWebView().loadUrl("https://baidu.com");
  </code>
</pre>
