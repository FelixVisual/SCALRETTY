@Override
    public void onGuildVoiceJoin(@NotNull GuildVoiceJoinEvent event) {

        if (event.getChannelJoined().getId().equals("1143214846482075698")) {

            String username = event.getMember().getEffectiveName();
            VoiceChannel vc;
            vc = event.getGuild().createVoiceChannel("channel-" + username, event.getGuild().getCategoryById("1143206875614158912")).complete();
            event.getGuild().moveVoiceMember(event.getMember(), vc).queue();
            vc.getManager().queue();


        }

    }

    @Override
    public void onGuildVoiceLeave(@NotNull GuildVoiceLeaveEvent event) {

        AudioChannel leftChannel = event.getChannelLeft();

        if (leftChannel != null && leftChannel.getMembers().isEmpty()) {
            leftChannel.delete().queue();


        }
    }
