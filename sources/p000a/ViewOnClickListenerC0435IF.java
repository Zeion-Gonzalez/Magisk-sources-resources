package p000a;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.topjohnwu.magisk.p001ui.log.LogFragment;

/* renamed from: a.IF */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0435IF implements View.OnClickListener {

    /* renamed from: R */
    public final /* synthetic */ Object f1423R;

    /* renamed from: S */
    public final /* synthetic */ int f1424S;

    public /* synthetic */ ViewOnClickListenerC0435IF(int i, Object obj) {
        this.f1424S = i;
        this.f1423R = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText;
        boolean z = true;
        int i = this.f1424S;
        PasswordTransformationMethod passwordTransformationMethod = null;
        Object obj = this.f1423R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                int i2 = C0222ED.f711gv;
                ((C0222ED) obj).m432m();
                throw null;
            case 1:
                C1884jU c1884jU = (C1884jU) obj;
                EditText editText2 = c1884jU.f5884W;
                if (editText2 != null) {
                    Editable text = editText2.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c1884jU.m1477q();
                    return;
                }
                return;
            case 2:
                ((C1132VC) obj).m2329s();
                return;
            case 3:
                C0294Fb c0294Fb = (C0294Fb) obj;
                EditText editText3 = c0294Fb.f1023Q;
                if (editText3 != null) {
                    int selectionEnd = editText3.getSelectionEnd();
                    EditText editText4 = c0294Fb.f1023Q;
                    if (editText4 == null || !(editText4.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z = false;
                    }
                    if (z) {
                        editText = c0294Fb.f1023Q;
                    } else {
                        editText = c0294Fb.f1023Q;
                        passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                    }
                    editText.setTransformationMethod(passwordTransformationMethod);
                    if (selectionEnd >= 0) {
                        c0294Fb.f1023Q.setSelection(selectionEnd);
                    }
                    c0294Fb.m1477q();
                    return;
                }
                return;
            default:
                int i3 = LogFragment.f9609he;
                ((LogFragment) obj).m5137HL(true);
                return;
        }
    }
}
