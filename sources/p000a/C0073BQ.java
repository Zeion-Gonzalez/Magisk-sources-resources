package p000a;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.topjohnwu.magisk.core.data.SuLogDatabase_Impl;
import java.io.IOException;
import java.util.BitSet;
import java.util.Locale;

/* renamed from: a.BQ */
/* loaded from: classes.dex */
public final class C0073BQ implements InterfaceC0491JG {

    /* renamed from: R */
    public final Object f309R;

    /* renamed from: S */
    public int f310S;

    public C0073BQ(byte b, int i) {
        BitSet valueOf = BitSet.valueOf(new byte[]{b});
        this.f309R = valueOf;
        this.f310S = i;
        if (valueOf.get(0)) {
            throw new RuntimeException("Reserved0 field must be 0");
        }
        if (valueOf.get(1)) {
            throw new RuntimeException("Reserved1 field must be 0");
        }
        if (!valueOf.get(5)) {
            throw new RuntimeException("Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)");
        }
        if (this.f310S != 1) {
            throw new RuntimeException(String.format(Locale.ROOT, "Version %d is unsupported", Integer.valueOf(this.f310S)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:287:0x03a0 A[Catch: all -> 0x03f9, TRY_LEAVE, TryCatch #4 {all -> 0x03f9, blocks: (B:248:0x02af, B:253:0x02c8, B:254:0x02cd, B:256:0x02d3, B:259:0x02e0, B:263:0x02ee, B:283:0x038b, B:287:0x03a0, B:284:0x0390, B:294:0x03b4, B:295:0x03b7, B:296:0x03b8, B:291:0x03b1, B:264:0x0305, B:270:0x0326, B:271:0x0332, B:273:0x0338, B:276:0x033f, B:280:0x0354, B:281:0x036f), top: B:332:0x02af, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x039f A[SYNTHETIC] */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000a.C1379Zo m152N(p000a.C0834PY r27) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0073BQ.m152N(a.PY):a.Zo");
    }

    /* renamed from: P */
    public final boolean m153P(int i) {
        BitSet bitSet = (BitSet) this.f309R;
        if (i != 0) {
            return bitSet.get(i - 1);
        }
        throw null;
    }

    /* renamed from: Q */
    public final synchronized int m154Q(C2654y3 c2654y3) {
        int i;
        int callingPid = Binder.getCallingPid();
        SparseArray sparseArray = (SparseArray) ((SparseArray) this.f309R).get(callingPid);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            ((SparseArray) this.f309R).put(callingPid, sparseArray);
        }
        i = this.f310S;
        this.f310S = i + 1;
        sparseArray.append(i, c2654y3);
        return i;
    }

    @Override // p000a.InterfaceC0491JG
    /* renamed from: h */
    public final boolean mo155h(View view) {
        ((BottomSheetBehavior) this.f309R).m5010X(this.f310S);
        return true;
    }

    /* renamed from: v */
    public final synchronized C2654y3 m156v(int i) {
        C2654y3 c2654y3;
        SparseArray sparseArray = (SparseArray) ((SparseArray) this.f309R).get(Binder.getCallingPid());
        if (sparseArray == null) {
            throw new IOException("Requested file was not opened!");
        }
        c2654y3 = (C2654y3) sparseArray.get(i);
        if (c2654y3 == null) {
            throw new IOException("Requested file was not opened!");
        }
        return c2654y3;
    }

    /* renamed from: z */
    public final DialogInterfaceC0723Nb m157z() {
        int i;
        C1319Yj c1319Yj = (C1319Yj) this.f309R;
        DialogInterfaceC0723Nb dialogInterfaceC0723Nb = new DialogInterfaceC0723Nb(c1319Yj.f4190z, this.f310S);
        View view = c1319Yj.f4182N;
        C0789Oh c0789Oh = dialogInterfaceC0723Nb.f2427k;
        int i2 = 0;
        if (view != null) {
            c0789Oh.f2677w = view;
        } else {
            CharSequence charSequence = c1319Yj.f4183P;
            if (charSequence != null) {
                c0789Oh.f2661P = charSequence;
                TextView textView = c0789Oh.f2664S;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c1319Yj.f4189v;
            if (drawable != null) {
                c0789Oh.f2659M = drawable;
                c0789Oh.f2657G = 0;
                ImageView imageView = c0789Oh.f2666V;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0789Oh.f2666V.setImageDrawable(drawable);
                }
            }
        }
        if (c1319Yj.f4188u != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c1319Yj.f4186h.inflate(c0789Oh.f2669g, (ViewGroup) null);
            if (c1319Yj.f4185W) {
                i = c0789Oh.f2678y;
            } else {
                i = c0789Oh.f2674s;
            }
            ListAdapter listAdapter = c1319Yj.f4188u;
            if (listAdapter == null) {
                listAdapter = new C2066mv(c1319Yj.f4190z, i);
            }
            c0789Oh.f2658I = listAdapter;
            c0789Oh.f2673q = c1319Yj.f4181G;
            if (c1319Yj.f4187o != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0200Dp(c1319Yj, i2, c0789Oh));
            }
            if (c1319Yj.f4185W) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0789Oh.f2660N = alertController$RecycleListView;
        }
        c1319Yj.getClass();
        dialogInterfaceC0723Nb.setCancelable(true);
        c1319Yj.getClass();
        dialogInterfaceC0723Nb.setCanceledOnTouchOutside(true);
        c1319Yj.getClass();
        dialogInterfaceC0723Nb.setOnCancelListener(null);
        c1319Yj.getClass();
        dialogInterfaceC0723Nb.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = c1319Yj.f4184Q;
        if (onKeyListener != null) {
            dialogInterfaceC0723Nb.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC0723Nb;
    }

    public C0073BQ(int i) {
        if (i != 7) {
            this.f310S = 0;
            this.f309R = new SparseArray();
        } else {
            this.f310S = 0;
            this.f309R = new StringBuilder();
        }
    }

    public C0073BQ(int i, C0980SO[] c0980soArr) {
        this.f310S = i;
        this.f309R = c0980soArr;
    }

    public C0073BQ(Context context) {
        int m1680W = DialogInterfaceC0723Nb.m1680W(context, 0);
        this.f309R = new C1319Yj(new ContextThemeWrapper(context, DialogInterfaceC0723Nb.m1680W(context, m1680W)));
        this.f310S = m1680W;
    }

    public C0073BQ(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f309R = bottomSheetBehavior;
        this.f310S = i;
    }

    public C0073BQ(SuLogDatabase_Impl suLogDatabase_Impl) {
        this.f309R = suLogDatabase_Impl;
        this.f310S = 2;
    }
}
