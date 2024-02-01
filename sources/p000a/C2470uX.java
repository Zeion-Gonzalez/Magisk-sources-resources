package p000a;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: a.uX */
/* loaded from: classes.dex */
public final class C2470uX implements TimeInterpolator {

    /* renamed from: h */
    public int f7567h;

    /* renamed from: v */
    public int f7568v;

    /* renamed from: z */
    public int[] f7569z;

    public C2470uX(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.f7567h = numberOfFrames;
        int[] iArr = this.f7569z;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.f7569z = new int[numberOfFrames];
        }
        int[] iArr2 = this.f7569z;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr2[i2] = duration;
            i += duration;
        }
        this.f7568v = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = (int) ((f * this.f7568v) + 0.5f);
        int i2 = this.f7567h;
        int[] iArr = this.f7569z;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        return (i3 / i2) + (i3 < i2 ? i / this.f7568v : 0.0f);
    }
}
