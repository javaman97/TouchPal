package com.yahoo.mobile.client.share.search.suggest;

import com.yahoo.mobile.client.share.search.suggest.SearchSuggestController;

/* renamed from: com.yahoo.mobile.client.share.search.suggest.e */
public final class C4152e implements SearchSuggestController.ISuggestTrimmer {
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1 A[LOOP:1: B:33:0x00b1->B:40:0x00d9, LOOP_START, PHI: r3 
      PHI: (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:32:0x00af, B:40:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void trimSearchResults(com.yahoo.mobile.client.share.search.data.SearchQuery r9, java.util.List<com.yahoo.mobile.client.share.search.suggest.ISuggestContainer> r10, java.util.List<com.yahoo.mobile.client.share.search.suggest.ISuggestContainer> r11, java.util.Map<com.yahoo.mobile.client.share.search.suggest.ISuggestContainer, java.util.List<com.yahoo.mobile.client.share.search.data.SearchAssistData>> r12) {
        /*
            r8 = this;
            r7 = 3
            r6 = 1
            r3 = 0
            if (r12 != 0) goto L_0x0006
        L_0x0005:
            return
        L_0x0006:
            if (r9 == 0) goto L_0x001a
            java.lang.String r0 = r9.getQueryString()
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = r9.getQueryString()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0005
        L_0x001a:
            if (r10 == 0) goto L_0x00dc
            r2 = r3
        L_0x001d:
            int r0 = r10.size()
            if (r2 >= r0) goto L_0x0052
            java.lang.Object r0 = r10.get(r2)
            com.yahoo.mobile.client.share.search.suggest.ISuggestContainer r0 = (com.yahoo.mobile.client.share.search.suggest.ISuggestContainer) r0
            java.lang.Object r1 = r12.get(r0)
            java.util.List r1 = (java.util.List) r1
            int r4 = r0.getMaxResultCount(r9)
            if (r4 <= 0) goto L_0x004e
            int r4 = r1.size()
            int r5 = r0.getMaxResultCount(r9)
            if (r4 <= r5) goto L_0x004e
            int r0 = r0.getMaxResultCount(r9)
            int r4 = r1.size()
            java.util.List r0 = r1.subList(r0, r4)
            r0.clear()
        L_0x004e:
            int r0 = r2 + 1
            r2 = r0
            goto L_0x001d
        L_0x0052:
            int r0 = r10.size()
            if (r0 <= r6) goto L_0x00dc
            java.lang.Object r0 = r10.get(r3)
            com.yahoo.mobile.client.share.search.suggest.ISuggestContainer r0 = (com.yahoo.mobile.client.share.search.suggest.ISuggestContainer) r0
            java.lang.Object r1 = r10.get(r6)
            com.yahoo.mobile.client.share.search.suggest.ISuggestContainer r1 = (com.yahoo.mobile.client.share.search.suggest.ISuggestContainer) r1
            boolean r2 = r1 instanceof com.yahoo.mobile.client.share.search.suggest.C4140c
            if (r2 != 0) goto L_0x00dc
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r12.get(r1)
            java.util.List r1 = (java.util.List) r1
            int r2 = r0.size()
            int r4 = r1.size()
            int r2 = r2 + r4
            if (r2 <= r7) goto L_0x0091
            int r2 = r0.size()
            if (r2 != r7) goto L_0x0091
            r2 = 2
            int r4 = r0.size()
            java.util.List r2 = r0.subList(r2, r4)
            r2.clear()
        L_0x0091:
            int r2 = r0.size()
            int r0 = 3 - r2
            if (r0 < 0) goto L_0x00aa
            int r4 = r1.size()
            if (r0 >= r4) goto L_0x00aa
            int r4 = r1.size()
            java.util.List r0 = r1.subList(r0, r4)
            r0.clear()
        L_0x00aa:
            int r0 = r1.size()
            r1 = r0
        L_0x00af:
            if (r11 == 0) goto L_0x0005
        L_0x00b1:
            int r0 = r11.size()
            if (r3 >= r0) goto L_0x0005
            java.lang.Object r0 = r11.get(r3)
            com.yahoo.mobile.client.share.search.suggest.ISuggestContainer r0 = (com.yahoo.mobile.client.share.search.suggest.ISuggestContainer) r0
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00d9
            int r4 = 6 - r2
            int r4 = r4 - r1
            int r5 = r0.size()
            if (r4 >= r5) goto L_0x00d9
            int r5 = r0.size()
            java.util.List r0 = r0.subList(r4, r5)
            r0.clear()
        L_0x00d9:
            int r3 = r3 + 1
            goto L_0x00b1
        L_0x00dc:
            r1 = r3
            r2 = r3
            goto L_0x00af
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yahoo.mobile.client.share.search.suggest.C4152e.trimSearchResults(com.yahoo.mobile.client.share.search.data.SearchQuery, java.util.List, java.util.List, java.util.Map):void");
    }
}
