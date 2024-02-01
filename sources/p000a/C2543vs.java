package p000a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* renamed from: a.vs */
/* loaded from: classes.dex */
public class C2543vs extends ImageButton {

    /* renamed from: R */
    public final C2165op f7778R;

    /* renamed from: S */
    public final C2226py f7779S;

    /* renamed from: w */
    public boolean f7780w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2543vs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1365ZY.m2763z(context);
        this.f7780w = false;
        AbstractC1757h0.m3289z(this, getContext());
        C2226py c2226py = new C2226py(this);
        this.f7779S = c2226py;
        c2226py.m3864N(attributeSet, i);
        C2165op c2165op = new C2165op(this);
        this.f7778R = c2165op;
        c2165op.m3775h(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2226py c2226py = this.f7779S;
        if (c2226py != null) {
            c2226py.m3871z();
        }
        C2165op c2165op = this.f7778R;
        if (c2165op != null) {
            c2165op.m3777z();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(this.f7778R.f6639z.getBackground() instanceof RippleDrawable)) != false && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2226py c2226py = this.f7779S;
        if (c2226py != null) {
            c2226py.m3866Q();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2226py c2226py = this.f7779S;
        if (c2226py != null) {
            c2226py.m3869u(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C2165op c2165op = this.f7778R;
        if (c2165op != null) {
            c2165op.m3777z();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        C2165op c2165op = this.f7778R;
        if (c2165op != null && drawable != null && !this.f7780w) {
            c2165op.f6638h = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c2165op != null) {
            c2165op.m3777z();
            if (!this.f7780w) {
                ImageView imageView = c2165op.f6639z;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(c2165op.f6638h);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f7780w = true;
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.f7778R.m3776v(i);
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C2165op c2165op = this.f7778R;
        if (c2165op != null) {
            c2165op.m3777z();
        }
    }
}
