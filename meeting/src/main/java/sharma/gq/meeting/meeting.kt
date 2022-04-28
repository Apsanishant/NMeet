package sharma.gq.meeting

import org.jitsi.meet.sdk.JitsiMeetConferenceOptions
import java.net.URL


object meeting {
    fun meet(meetingRoom : String, audioOnly : Boolean, audioMuted : Boolean, videoMuted : Boolean){
        val options: JitsiMeetConferenceOptions = JitsiMeetConferenceOptions.Builder()
            .setServerURL(URL("https://meet.jit.si"))
            .setRoom(meetingRoom)
            .setAudioMuted(audioMuted)
            .setVideoMuted(videoMuted)
            .setAudioOnly(audioOnly)
            .setWelcomePageEnabled(false)
            .build()
    }
}