package com.habitrpg.android.habitica.events.commands;

import com.magicmicky.habitrpgwrapper.lib.models.ChatMessage;

/**
 * Created by Negue on 30.08.2015.
 */
public class DeleteChatMessageCommand extends ChatMessageCommandBase {
    public DeleteChatMessageCommand(String groupId, ChatMessage chatMessage) {
        super(groupId, chatMessage);
    }
}
