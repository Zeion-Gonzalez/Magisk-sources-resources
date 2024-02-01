package p000a;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: a.nN */
/* loaded from: classes.dex */
public final class C2090nN extends C1665fK {

    /* renamed from: R */
    public final EditText f6454R;

    /* renamed from: w */
    public final C1936kR f6455w;

    public C2090nN(EditText editText) {
        super(16);
        this.f6454R = editText;
        C1936kR c1936kR = new C1936kR(editText);
        this.f6455w = c1936kR;
        editText.addTextChangedListener(c1936kR);
        if (C1621eV.f5006h == null) {
            synchronized (C1621eV.f5008z) {
                if (C1621eV.f5006h == null) {
                    C1621eV.f5006h = new C1621eV();
                }
            }
        }
        editText.setEditableFactory(C1621eV.f5006h);
    }

    @Override // p000a.C1665fK
    /* renamed from: R */
    public final KeyListener mo3155R(KeyListener keyListener) {
        if (keyListener instanceof C0223EE) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0223EE(keyListener);
    }

    @Override // p000a.C1665fK
    /* renamed from: f */
    public final void mo2034f(boolean z) {
        C1936kR c1936kR = this.f6455w;
        if (c1936kR.f6011w != z) {
            c1936kR.getClass();
            c1936kR.f6011w = z;
            if (z) {
                AbstractC2473ua.m4249z();
                throw null;
            }
        }
    }

    @Override // p000a.C1665fK
    /* renamed from: g */
    public final InputConnection mo3156g(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof C0696N9 ? inputConnection : new C0696N9(this.f6454R, inputConnection);
    }
}
