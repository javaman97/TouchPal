package com.google.android.gms.games.multiplayer;

import com.google.android.gms.games.Player;
import com.google.android.gms.internal.C3802s;
import java.util.ArrayList;

public final class ParticipantUtils {
    private ParticipantUtils() {
    }

    public static String getParticipantId(ArrayList<Participant> arrayList, String str) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Participant participant = arrayList.get(i);
            Player player = participant.getPlayer();
            if (player != null && player.getPlayerId().equals(str)) {
                return participant.getParticipantId();
            }
        }
        return null;
    }

    /* renamed from: z */
    public static boolean m15551z(String str) {
        C3802s.m16675b(str, (Object) "Participant ID must not be null");
        return str.startsWith("p_");
    }
}
