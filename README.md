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
<pre>
  <code>
    <cn.webview.x5.ProgressWebView
        android:id="@+id/webviewa"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
        
        
        
        webView = findViewById(R.id.webview);
        webView.getWebView().loadUrl("https://baidu.com");
  </code>
</pre>
