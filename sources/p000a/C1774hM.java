package p000a;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.topjohnwu.magisk.R;

/* renamed from: a.hM */
/* loaded from: classes.dex */
public final class C1774hM {

    /* renamed from: N */
    public Object f5588N;

    /* renamed from: P */
    public Object f5589P;

    /* renamed from: Q */
    public Object f5590Q;

    /* renamed from: h */
    public Object f5591h;

    /* renamed from: u */
    public Object f5592u;

    /* renamed from: v */
    public Object f5593v;

    /* renamed from: z */
    public Object f5594z;

    public C1774hM(C1774hM c1774hM) {
        this.f5594z = (C0846Po) c1774hM.f5594z;
        this.f5591h = (C0054B3) c1774hM.f5591h;
        this.f5593v = (C0054B3) c1774hM.f5593v;
        this.f5589P = (C0054B3) c1774hM.f5589P;
        this.f5588N = (C0054B3) c1774hM.f5588N;
        this.f5590Q = (C0054B3) c1774hM.f5590Q;
        this.f5592u = (C2528vZ) c1774hM.f5592u;
    }

    public C1774hM(Context context) {
        this.f5589P = new WindowManager.LayoutParams();
        this.f5588N = new Rect();
        this.f5590Q = new int[2];
        this.f5592u = new int[2];
        this.f5594z = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f5591h = inflate;
        this.f5593v = (TextView) inflate.findViewById(R.id.message);
        ((WindowManager.LayoutParams) this.f5589P).setTitle(C1774hM.class.getSimpleName());
        ((WindowManager.LayoutParams) this.f5589P).packageName = ((Context) this.f5594z).getPackageName();
        Object obj = this.f5589P;
        ((WindowManager.LayoutParams) obj).type = 1002;
        ((WindowManager.LayoutParams) obj).width = -2;
        ((WindowManager.LayoutParams) obj).height = -2;
        ((WindowManager.LayoutParams) obj).format = -3;
        ((WindowManager.LayoutParams) obj).windowAnimations = 2131951620;
        ((WindowManager.LayoutParams) obj).flags = 24;
    }
}
