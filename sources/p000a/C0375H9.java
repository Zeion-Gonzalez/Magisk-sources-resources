package p000a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;

/* renamed from: a.H9 */
/* loaded from: classes.dex */
public final class C0375H9 {

    /* renamed from: Q */
    public boolean f1284Q;

    /* renamed from: u */
    public final TextView f1286u;

    /* renamed from: z */
    public final /* synthetic */ int f1288z;

    /* renamed from: h */
    public ColorStateList f1285h = null;

    /* renamed from: v */
    public PorterDuff.Mode f1287v = null;

    /* renamed from: P */
    public boolean f1283P = false;

    /* renamed from: N */
    public boolean f1282N = false;

    public /* synthetic */ C0375H9(TextView textView, int i) {
        this.f1288z = i;
        this.f1286u = textView;
    }

    /* renamed from: h */
    public final void m863h() {
        TextView textView = this.f1286u;
        Drawable checkMarkDrawable = ((CheckedTextView) textView).getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1283P || this.f1282N) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f1283P) {
                    AbstractC0235ET.m478o(mutate, this.f1285h);
                }
                if (this.f1282N) {
                    AbstractC0235ET.m476W(mutate, this.f1287v);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CheckedTextView) textView).getDrawableState());
                }
                ((CheckedTextView) textView).setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:6:0x0032, B:8:0x0038, B:10:0x003e, B:14:0x0053, B:16:0x0059, B:18:0x005f, B:19:0x0070, B:21:0x0076, B:22:0x0080, B:24:0x0086), top: B:59:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:6:0x0032, B:8:0x0038, B:10:0x003e, B:14:0x0053, B:16:0x0059, B:18:0x005f, B:19:0x0070, B:21:0x0076, B:22:0x0080, B:24:0x0086), top: B:59:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd A[Catch: all -> 0x011e, TryCatch #3 {all -> 0x011e, blocks: (B:31:0x00b9, B:33:0x00bf, B:35:0x00c5, B:39:0x00da, B:41:0x00e0, B:43:0x00e6, B:44:0x00f7, B:46:0x00fd, B:47:0x0107, B:49:0x010d), top: B:63:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d A[Catch: all -> 0x011e, TRY_LEAVE, TryCatch #3 {all -> 0x011e, blocks: (B:31:0x00b9, B:33:0x00bf, B:35:0x00c5, B:39:0x00da, B:41:0x00e0, B:43:0x00e6, B:44:0x00f7, B:46:0x00fd, B:47:0x0107, B:49:0x010d), top: B:63:0x00b9 }] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m864v(android.util.AttributeSet r17, int r18) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0375H9.m864v(android.util.AttributeSet, int):void");
    }

    /* renamed from: z */
    public final void m865z() {
        TextView textView = this.f1286u;
        Drawable m2929z = AbstractC1511cT.m2929z((CompoundButton) textView);
        if (m2929z != null) {
            if (this.f1283P || this.f1282N) {
                Drawable mutate = m2929z.mutate();
                if (this.f1283P) {
                    AbstractC0235ET.m478o(mutate, this.f1285h);
                }
                if (this.f1282N) {
                    AbstractC0235ET.m476W(mutate, this.f1287v);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CompoundButton) textView).getDrawableState());
                }
                ((CompoundButton) textView).setButtonDrawable(mutate);
            }
        }
    }
}
