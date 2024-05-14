// Generated code from Butter Knife. Do not modify!
package app.vit.imgtextsteganosoftware.activities.stego;

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

public class StegoActivity_ViewBinding implements Unbinder {
  private StegoActivity target;

  private View view7f09004a;

  private View view7f09004b;

  @UiThread
  public StegoActivity_ViewBinding(StegoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StegoActivity_ViewBinding(final StegoActivity target, View source) {
    this.target = target;

    View view;
    target.ivStegoImage = Utils.findRequiredViewAsType(source, R.id.ivStegoImage, "field 'ivStegoImage'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.bStegoSave, "method 'onClick'");
    view7f09004a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bStegoShare, "method 'onClick'");
    view7f09004b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    StegoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivStegoImage = null;

    view7f09004a.setOnClickListener(null);
    view7f09004a = null;
    view7f09004b.setOnClickListener(null);
    view7f09004b = null;
  }
}
