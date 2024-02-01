package p000a;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.DJ */
/* loaded from: classes.dex */
public final class C0171DJ extends EdgeEffect {

    /* renamed from: h */
    public final /* synthetic */ int f534h;

    /* renamed from: v */
    public final /* synthetic */ RecyclerView f535v;

    /* renamed from: z */
    public boolean f536z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0171DJ(int i, RecyclerView recyclerView, Context context) {
        super(context);
        this.f534h = i;
        this.f535v = recyclerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0014, code lost:
    
        if (r3 != 3) goto L42;
     */
    @Override // android.widget.EdgeEffect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            boolean r0 = r8.f536z
            r1 = 3
            r2 = 2
            int r3 = r8.f534h
            r4 = 1
            androidx.recyclerview.widget.RecyclerView r5 = r8.f535v
            if (r0 == 0) goto Lc
            goto L52
        Lc:
            r8.f536z = r4
            if (r3 == 0) goto L33
            if (r3 == r4) goto L17
            if (r3 == r2) goto L33
            if (r3 == r1) goto L17
            goto L52
        L17:
            int r0 = r5.getMeasuredWidth()
            int r6 = r5.getPaddingLeft()
            int r0 = r0 - r6
            int r6 = r5.getPaddingRight()
            int r0 = r0 - r6
            int r6 = r5.getMeasuredHeight()
            int r7 = r5.getPaddingTop()
            int r6 = r6 - r7
            int r7 = r5.getPaddingBottom()
            goto L4e
        L33:
            int r0 = r5.getMeasuredHeight()
            int r6 = r5.getPaddingTop()
            int r0 = r0 - r6
            int r6 = r5.getPaddingBottom()
            int r0 = r0 - r6
            int r6 = r5.getMeasuredWidth()
            int r7 = r5.getPaddingLeft()
            int r6 = r6 - r7
            int r7 = r5.getPaddingRight()
        L4e:
            int r6 = r6 - r7
            r8.setSize(r0, r6)
        L52:
            int r0 = r9.save()
            r6 = 0
            if (r3 == 0) goto L7f
            if (r3 == r4) goto L71
            if (r3 == r2) goto L6a
            if (r3 == r1) goto L60
            goto L87
        L60:
            int r1 = r5.getPaddingRight()
            float r1 = (float) r1
            int r2 = r5.getPaddingBottom()
            goto L7a
        L6a:
            int r1 = r5.getPaddingTop()
            float r1 = (float) r1
            float r1 = -r1
            goto L84
        L71:
            int r1 = r5.getPaddingLeft()
            float r1 = (float) r1
            int r2 = r5.getPaddingTop()
        L7a:
            float r2 = (float) r2
            r9.translate(r1, r2)
            goto L87
        L7f:
            int r1 = r5.getPaddingBottom()
            float r1 = (float) r1
        L84:
            r9.translate(r1, r6)
        L87:
            boolean r1 = super.draw(r9)
            r9.restoreToCount(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0171DJ.draw(android.graphics.Canvas):boolean");
    }
}
