package p000a;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* renamed from: a.Zx */
/* loaded from: classes.dex */
public final class C1386Zx extends InputConnectionWrapper {

    /* renamed from: z */
    public final /* synthetic */ C0024AR f4321z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1386Zx(InputConnection inputConnection, C0024AR c0024ar) {
        super(inputConnection, false);
        this.f4321z = c0024ar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C2196pM c2196pM = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c2196pM = new C2196pM(12, new C1979lE(inputContentInfo));
        }
        if (this.f4321z.m58v(c2196pM, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
