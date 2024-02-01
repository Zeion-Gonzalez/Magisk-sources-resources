package p000a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.topjohnwu.magisk.R;

/* renamed from: a.pY */
/* loaded from: classes.dex */
public final class C2206pY extends C2417tX implements InterfaceC1653f5 {

    /* renamed from: I */
    public final /* synthetic */ C2192pI f6779I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2206pY(C2192pI c2192pI, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f6779I = c2192pI;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC1843ih.m3411Ha(this, getContentDescription());
        setOnTouchListener(new C0681Ms(this, this, c2192pI, 0));
    }

    @Override // p000a.InterfaceC1653f5
    /* renamed from: P */
    public final boolean mo3124P() {
        return false;
    }

    @Override // p000a.InterfaceC1653f5
    /* renamed from: h */
    public final boolean mo3125h() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f6779I.m3809w();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC0235ET.m475Q(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
