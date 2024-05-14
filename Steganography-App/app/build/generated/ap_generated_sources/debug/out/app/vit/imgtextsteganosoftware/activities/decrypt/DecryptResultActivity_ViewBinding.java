// Generated code from Butter Knife. Do not modify!
package app.vit.imgtextsteganosoftware.activities.decrypt;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import app.vit.imgtextsteganosoftware.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DecryptResultActivity_ViewBinding implements Unbinder {
  private DecryptResultActivity target;

  @UiThread
  public DecryptResultActivity_ViewBinding(DecryptResultActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DecryptResultActivity_ViewBinding(DecryptResultActivity target, View source) {
    this.target = target;

    target.tvSecretMessage = Utils.findRequiredViewAsType(source, R.id.tvSecretMessage, "field 'tvSecretMessage'", TextView.class);
    target.ivSecretImage = Utils.findRequiredViewAsType(source, R.id.ivSecretImage, "field 'ivSecretImage'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DecryptResultActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvSecretMessage = null;
    target.ivSecretImage = null;
  }
}
