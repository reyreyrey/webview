package webview.rea.com.webview.x5;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.tencent.smtt.sdk.DownloadListener;

import webview.rea.com.webview.x5.download.download.DownloadAppService;
import webview.rea.com.webview.x5.download.download.UpdateProgressDialog;


public class IDownloadListener implements DownloadListener {
    private AppCompatActivity context;

    public IDownloadListener(Context context) {
        this.context = (AppCompatActivity) context;
    }

    @Override
    public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimeType, long length) {
        DownloadAppService.downloadAppAndInstall(context, url, true);
        UpdateProgressDialog dialog = new UpdateProgressDialog();
        dialog.show(context.getSupportFragmentManager(), "update");
    }


}
