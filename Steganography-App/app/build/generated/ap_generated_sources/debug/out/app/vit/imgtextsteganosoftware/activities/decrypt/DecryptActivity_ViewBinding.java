// Generated code from Butter Knife. Do not modify!
package app.vit.imgtextsteganosoftware.activities.decrypt;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import app.vit.imgtextsteganosoftware.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DecryptActivity_ViewBinding implements Unbinder {
  private DecryptActivity target;

  private View view7f09009a;

  private View view7f090048;

  @UiThread
  public DecryptActivity_ViewBinding(DecryptActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DecryptActivity_ViewBinding(final DecryptActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.ivStegoImage, "field 'ivStegoImage' and method 'onStegoImageClick'");
    target.ivStegoImage = Utils.castView(view, R.id.ivStegoImage, "field 'ivStegoImage'", ImageView.class);
    view7f09009a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onStegoImageClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.bDecrypt, "method 'onButtonClick'");
    view7f090048 = view;
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
    DecryptActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivStegoImage = null;

    view7f09009a.setOnClickListener(null);
    view7f09009a = null;
    view7f090048.setOnClickListener(null);
    view7f090048 = null;
  }
}
