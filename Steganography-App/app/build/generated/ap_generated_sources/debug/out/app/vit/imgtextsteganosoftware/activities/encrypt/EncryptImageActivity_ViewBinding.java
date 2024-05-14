// Generated code from Butter Knife. Do not modify!
package app.vit.imgtextsteganosoftware.activities.encrypt;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import app.vit.imgtextsteganosoftware.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EncryptImageActivity_ViewBinding implements Unbinder {
  private EncryptImageActivity target;

  private View view7f090098;

  private View view7f090099;

  private View view7f090049;

  @UiThread
  public EncryptImageActivity_ViewBinding(EncryptImageActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EncryptImageActivity_ViewBinding(final EncryptImageActivity target, View source) {
    this.target = target;

    View view;
    target.etSecretMessage = Utils.findRequiredViewAsType(source, R.id.etSecretMessage, "field 'etSecretMessage'", EditText.class);
    view = Utils.findRequiredView(source, R.id.ivCoverImage, "field 'ivCoverImage' and method 'onCoverSecretImageClick'");
    target.ivCoverImage = Utils.castView(view, R.id.ivCoverImage, "field 'ivCoverImage'", ImageView.class);
    view7f090098 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCoverSecretImageClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ivSecretImage, "field 'ivSecretImage' and method 'onCoverSecretImageClick'");
    target.ivSecretImage = Utils.castView(view, R.id.ivSecretImage, "field 'ivSecretImage'", ImageView.class);
    view7f090099 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCoverSecretImageClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bEncrypt, "method 'onButtonClick'");
    view7f090049 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onButtonClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    EncryptImageActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etSecretMessage = null;
    target.ivCoverImage = null;
    target.ivSecretImage = null;

    view7f090098.setOnClickListener(null);
    view7f090098 = null;
    view7f090099.setOnClickListener(null);
    view7f090099 = null;
    view7f090049.setOnClickListener(null);
    view7f090049 = null;
  }
}
