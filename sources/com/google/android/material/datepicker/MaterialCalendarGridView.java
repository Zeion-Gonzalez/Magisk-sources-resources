package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.topjohnwu.magisk.R;
import p000a.AbstractC2446u3;
import p000a.AbstractC2674yV;
import p000a.C0187Dc;
import p000a.C0222ED;
import p000a.C2035mJ;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: S */
    public final boolean f9335S;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC2674yV.m4585P(null);
        if (C0222ED.m428b(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f9335S = C0222ED.m430nP(getContext(), R.attr.nestedScrollable);
        AbstractC2446u3.m4221V(this, new C0187Dc(3, this));
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C2035mJ adapter = getAdapter();
        adapter.getClass();
        int max = Math.max(adapter.m3674z(), getFirstVisiblePosition());
        int min = Math.min((adapter.m3674z() + adapter.f6352z.f1061q) - 1, getLastVisiblePosition());
        adapter.getItem(max);
        adapter.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int m3674z;
        if (z) {
            if (i == 33) {
                C2035mJ adapter = getAdapter();
                m3674z = (adapter.m3674z() + adapter.f6352z.f1061q) - 1;
            } else if (i == 130) {
                m3674z = getAdapter().m3674z();
            } else {
                super.onFocusChanged(true, i, rect);
                return;
            }
            setSelection(m3674z);
            return;
        }
        super.onFocusChanged(false, i, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().m3674z()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().m3674z());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f9335S) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < getAdapter().m3674z()) {
            i = getAdapter().m3674z();
        }
        super.setSelection(i);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: z */
    public final C2035mJ getAdapter2() {
        return (C2035mJ) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C2035mJ)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C2035mJ.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
