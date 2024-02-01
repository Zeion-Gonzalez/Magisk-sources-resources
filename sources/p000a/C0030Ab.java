package p000a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* renamed from: a.Ab */
/* loaded from: classes.dex */
public final class C0030Ab {

    /* renamed from: z */
    public final C2698yx f168z = new C2698yx();

    /* renamed from: h */
    public final C2698yx f167h = new C2698yx();

    /* renamed from: h */
    public static C0030Ab m67h(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m68v(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m68v(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: v */
    public static C0030Ab m68v(ArrayList arrayList) {
        C0030Ab c0030Ab = new C0030Ab();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                c0030Ab.m73o(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = AbstractC1090US.f3563v;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = AbstractC1090US.f3561P;
                    }
                } else {
                    interpolator = AbstractC1090US.f3562h;
                }
                C1493c6 c1493c6 = new C1493c6(startDelay, duration, interpolator);
                c1493c6.f4633P = objectAnimator.getRepeatCount();
                c1493c6.f4632N = objectAnimator.getRepeatMode();
                c0030Ab.f168z.put(propertyName, c1493c6);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return c0030Ab;
    }

    /* renamed from: z */
    public static C0030Ab m69z(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m67h(context, resourceId);
    }

    /* renamed from: N */
    public final PropertyValuesHolder[] m70N(String str) {
        if (m74u(str)) {
            PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.f167h.getOrDefault(str, null);
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
            for (int i = 0; i < propertyValuesHolderArr.length; i++) {
                propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
            }
            return propertyValuesHolderArr2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: P */
    public final ObjectAnimator m71P(String str, ExtendedFloatingActionButton extendedFloatingActionButton, Property property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(extendedFloatingActionButton, m70N(str));
        ofPropertyValuesHolder.setProperty(property);
        m72Q(str).m2893z(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    /* renamed from: Q */
    public final C1493c6 m72Q(String str) {
        boolean z;
        C2698yx c2698yx = this.f168z;
        if (c2698yx.getOrDefault(str, null) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (C1493c6) c2698yx.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0030Ab) {
            return this.f168z.equals(((C0030Ab) obj).f168z);
        }
        return false;
    }

    public final int hashCode() {
        return this.f168z.hashCode();
    }

    /* renamed from: o */
    public final void m73o(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f167h.put(str, propertyValuesHolderArr);
    }

    public final String toString() {
        return "\n" + C0030Ab.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f168z + "}\n";
    }

    /* renamed from: u */
    public final boolean m74u(String str) {
        if (this.f167h.getOrDefault(str, null) != null) {
            return true;
        }
        return false;
    }
}
