package p000a;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.topjohnwu.magisk.R;

/* renamed from: a.Nb */
/* loaded from: classes.dex */
public final class DialogInterfaceC0723Nb extends AbstractDialogC2733zb implements DialogInterface {

    /* renamed from: k */
    public final C0789Oh f2427k;

    public DialogInterfaceC0723Nb(Context context, int i) {
        super(context, m1680W(context, i));
        this.f2427k = new C0789Oh(getContext(), this, getWindow());
    }

    /* renamed from: W */
    public static int m1680W(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x0227, code lost:
    
        if (r4 != null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0229, code lost:
    
        r4.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0234, code lost:
    
        if (r4 != null) goto L206;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0263  */
    @Override // p000a.AbstractDialogC2733zb, p000a.DialogC2096nV, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.DialogInterfaceC0723Nb.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        NestedScrollView nestedScrollView = this.f2427k.f2667W;
        if (nestedScrollView != null && nestedScrollView.m4794G(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z;
        NestedScrollView nestedScrollView = this.f2427k.f2667W;
        if (nestedScrollView != null && nestedScrollView.m4794G(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // p000a.AbstractDialogC2733zb, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C0789Oh c0789Oh = this.f2427k;
        c0789Oh.f2661P = charSequence;
        TextView textView = c0789Oh.f2664S;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
