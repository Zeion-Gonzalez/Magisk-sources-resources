package p000a;

import android.view.WindowInsets;

/* renamed from: a.V7 */
/* loaded from: classes.dex */
public abstract class AbstractC1128V7 {
    /* renamed from: z */
    public static int m2310z(int i) {
        int statusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                }
                i2 |= statusBars;
            }
        }
        return i2;
    }
}
