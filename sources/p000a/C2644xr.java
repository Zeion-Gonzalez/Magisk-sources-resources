package p000a;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;

/* renamed from: a.xr */
/* loaded from: classes.dex */
public final class C2644xr extends TouchDelegate {

    /* renamed from: N */
    public final int f8245N;

    /* renamed from: P */
    public final Rect f8246P;

    /* renamed from: Q */
    public boolean f8247Q;

    /* renamed from: h */
    public final Rect f8248h;

    /* renamed from: v */
    public final Rect f8249v;

    /* renamed from: z */
    public final View f8250z;

    public C2644xr(Rect rect, Rect rect2, SearchView.SearchAutoComplete searchAutoComplete) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.f8245N = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f8248h = rect3;
        Rect rect4 = new Rect();
        this.f8246P = rect4;
        Rect rect5 = new Rect();
        this.f8249v = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f8250z = searchAutoComplete;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f;
        int i;
        boolean z2;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z2 = this.f8247Q;
                if (z2 && !this.f8246P.contains(x, y)) {
                    z3 = z2;
                    z = false;
                }
            } else {
                if (action == 3) {
                    z2 = this.f8247Q;
                    this.f8247Q = false;
                }
                z = true;
                z3 = false;
            }
            z3 = z2;
            z = true;
        } else {
            if (this.f8248h.contains(x, y)) {
                this.f8247Q = true;
                z = true;
            }
            z = true;
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        Rect rect = this.f8249v;
        View view = this.f8250z;
        if (!z || rect.contains(x, y)) {
            f = x - rect.left;
            i = y - rect.top;
        } else {
            f = view.getWidth() / 2;
            i = view.getHeight() / 2;
        }
        motionEvent.setLocation(f, i);
        return view.dispatchTouchEvent(motionEvent);
    }
}
