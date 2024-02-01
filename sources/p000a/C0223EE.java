package p000a;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: a.EE */
/* loaded from: classes.dex */
public final class C0223EE implements KeyListener {

    /* renamed from: h */
    public final C1665fK f732h;

    /* renamed from: z */
    public final KeyListener f733z;

    public C0223EE(KeyListener keyListener) {
        C1665fK c1665fK = new C1665fK(18);
        this.f733z = keyListener;
        this.f732h = c1665fK;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f733z.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f733z.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean m4436k;
        boolean z;
        this.f732h.getClass();
        Object obj = AbstractC2473ua.f7574z;
        if (i != 67) {
            if (i != 112) {
                m4436k = false;
            } else {
                m4436k = AbstractC2575wW.m4436k(editable, keyEvent, true);
            }
        } else {
            m4436k = AbstractC2575wW.m4436k(editable, keyEvent, false);
        }
        if (m4436k) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        if (!z && !this.f733z.onKeyDown(view, editable, i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f733z.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f733z.onKeyUp(view, editable, i, keyEvent);
    }
}
