package p000a;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: a.na */
/* loaded from: classes.dex */
public abstract class AbstractC2100na extends AbstractC2257qV {

    /* renamed from: N */
    public static boolean f6476N = true;

    /* renamed from: P */
    public static boolean f6477P = true;

    /* renamed from: S */
    public void mo2167S(View view, Matrix matrix) {
        if (f6476N) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f6476N = false;
            }
        }
    }

    /* renamed from: V */
    public void mo2168V(View view, Matrix matrix) {
        if (f6477P) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f6477P = false;
            }
        }
    }
}
