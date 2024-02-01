package p000a;

import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: a.N9 */
/* loaded from: classes.dex */
public final class C0696N9 extends InputConnectionWrapper {

    /* renamed from: h */
    public final C1665fK f2348h;

    /* renamed from: z */
    public final TextView f2349z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0696N9(EditText editText, InputConnection inputConnection) {
        super(inputConnection, false);
        C1665fK c1665fK = new C1665fK(17);
        this.f2349z = editText;
        this.f2348h = c1665fK;
        Object obj = AbstractC2473ua.f7574z;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f2349z.getEditableText();
        this.f2348h.getClass();
        if (!C1665fK.m3143I(this, editableText, i, i2, false) && !super.deleteSurroundingText(i, i2)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f2349z.getEditableText();
        this.f2348h.getClass();
        if (C1665fK.m3143I(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
