package p000a;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.mt */
/* loaded from: classes.dex */
public final class C2064mt extends AbstractC0265F4 {

    /* renamed from: P */
    public final /* synthetic */ int f6414P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2064mt(AbstractC0667Md abstractC0667Md, int i) {
        super(abstractC0667Md);
        this.f6414P = i;
    }

    @Override // p000a.AbstractC0265F4
    /* renamed from: G */
    public final int mo563G(View view) {
        int i = this.f6414P;
        Rect rect = this.f935v;
        AbstractC0667Md abstractC0667Md = this.f936z;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                abstractC0667Md.m1546p(view, rect);
                return rect.right;
            default:
                abstractC0667Md.m1546p(view, rect);
                return rect.bottom;
        }
    }

    @Override // p000a.AbstractC0265F4
    /* renamed from: M */
    public final int mo564M(View view) {
        int i = this.f6414P;
        Rect rect = this.f935v;
        AbstractC0667Md abstractC0667Md = this.f936z;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                abstractC0667Md.m1546p(view, rect);
                return rect.left;
            default:
                abstractC0667Md.m1546p(view, rect);
                return rect.top;
        }
    }

    @Override // p000a.AbstractC0265F4
    /* renamed from: N */
    public final int mo565N() {
        int i = this.f6414P;
        AbstractC0667Md abstractC0667Md = this.f936z;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return abstractC0667Md.f2165R;
            default:
                return abstractC0667Md.f2173w;
        }
    }

    @Override // p000a.AbstractC0265F4
    /* renamed from: P */
    public final int mo566P(View view) {
        int top;
        int i;
        int i2 = this.f6414P;
        AbstractC0667Md abstractC0667Md = this.f936z;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0419Hv c0419Hv = (C0419Hv) view.getLayoutParams();
                abstractC0667Md.getClass();
                top = view.getLeft() - ((C0419Hv) view.getLayoutParams()).f1395h.left;
                i = ((ViewGroup.MarginLayoutParams) c0419Hv).leftMargin;
                break;
            default:
                C0419Hv c0419Hv2 = (C0419Hv) view.getLayoutParams();
                abstractC0667Md.getClass();
                top = view.getTop() - ((C0419Hv) view.getLayoutParams()).f1395h.top;
                i = ((ViewGroup.MarginLayoutParams) c0419Hv2).topMargin;
                break;
        }
        return top - i;
    }

    @Override // p000a.AbstractC0265F4
    /* renamed from: Q */
    public final int mo567Q() {
        int i;
        int m1523c;
        int i2 = this.f6414P;
        AbstractC0667Md abstractC0667Md = this.f936z;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                i = abstractC0667Md.f2165R;
                m1523c = abstractC0667Md.m1529e();
                break;
            default:
                i = abstractC0667Md.f2173w;
                m1523c = abstractC0667Md.m1523c();
                break;
        }
        return i - m1523c;
    }

    /* renamed from: S */
    public final int m3689S(View view) {
        int measuredWidth;
        int i;
        int i2 = this.f6414P;
        AbstractC0667Md abstractC0667Md = this.f936z;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0419Hv c0419Hv = (C0419Hv) view.getLayoutParams();
                abstractC0667Md.getClass();
                Rect rect = ((C0419Hv) view.getLayoutParams()).f1395h;
                measuredWidth = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0419Hv).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c0419Hv).bottomMargin;
                break;
            default:
                C0419Hv c0419Hv2 = (C0419Hv) view.getLayoutParams();
                abstractC0667Md.getClass();
                Rect rect2 = ((C0419Hv) view.getLayoutParams()).f1395h;
                measuredWidth = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0419Hv2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c0419Hv2).rightMargin;
                break;
        }
        return measuredWidth + i;
    }

    @Override // p000a.AbstractC0265F4
    /* renamed from: V */
    public final void mo568V(int i) {
        int i2 = this.f6414P;
        AbstractC0667Md abstractC0667Md = this.f936z;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                abstractC0667Md.mo1524d(i);
                return;
            default:
                abstractC0667Md.mo1505O(i);
                return;
        }
    }

    @Override // p000a.AbstractC0265F4
    /* renamed from: W */
    public final int mo569W() {
        int m1518X;
        int m1523c;
        int i = this.f6414P;
        AbstractC0667Md abstractC0667Md = this.f936z;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                m1518X = abstractC0667Md.f2165R - abstractC0667Md.m1496H();
                m1523c = abstractC0667Md.m1529e();
                break;
            default:
                m1518X = abstractC0667Md.f2173w - abstractC0667Md.m1518X();
                m1523c = abstractC0667Md.m1523c();
                break;
        }
        return m1518X - m1523c;
    }

    @Override // p000a.AbstractC0265F4
    /* renamed from: h */
    public final int mo570h(View view) {
        int bottom;
        int i;
        int i2 = this.f6414P;
        AbstractC0667Md abstractC0667Md = this.f936z;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0419Hv c0419Hv = (C0419Hv) view.getLayoutParams();
                abstractC0667Md.getClass();
                bottom = view.getRight() + ((C0419Hv) view.getLayoutParams()).f1395h.right;
                i = ((ViewGroup.MarginLayoutParams) c0419Hv).rightMargin;
                break;
            default:
                C0419Hv c0419Hv2 = (C0419Hv) view.getLayoutParams();
                abstractC0667Md.getClass();
                bottom = view.getBottom() + ((C0419Hv) view.getLayoutParams()).f1395h.bottom;
                i = ((ViewGroup.MarginLayoutParams) c0419Hv2).bottomMargin;
                break;
        }
        return bottom + i;
    }

    @Override // p000a.AbstractC0265F4
    /* renamed from: o */
    public final int mo571o() {
        int i = this.f6414P;
        AbstractC0667Md abstractC0667Md = this.f936z;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return abstractC0667Md.m1496H();
            default:
                return abstractC0667Md.m1518X();
        }
    }

    @Override // p000a.AbstractC0265F4
    /* renamed from: u */
    public final int mo572u() {
        int i = this.f6414P;
        AbstractC0667Md abstractC0667Md = this.f936z;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return abstractC0667Md.f2167V;
            default:
                return abstractC0667Md.f2166S;
        }
    }

    @Override // p000a.AbstractC0265F4
    /* renamed from: v */
    public final int mo573v(View view) {
        int measuredHeight;
        int i;
        int i2 = this.f6414P;
        AbstractC0667Md abstractC0667Md = this.f936z;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0419Hv c0419Hv = (C0419Hv) view.getLayoutParams();
                abstractC0667Md.getClass();
                Rect rect = ((C0419Hv) view.getLayoutParams()).f1395h;
                measuredHeight = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0419Hv).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c0419Hv).rightMargin;
                break;
            default:
                C0419Hv c0419Hv2 = (C0419Hv) view.getLayoutParams();
                abstractC0667Md.getClass();
                Rect rect2 = ((C0419Hv) view.getLayoutParams()).f1395h;
                measuredHeight = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0419Hv2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c0419Hv2).bottomMargin;
                break;
        }
        return measuredHeight + i;
    }
}
