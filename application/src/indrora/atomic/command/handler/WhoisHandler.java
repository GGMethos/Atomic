/*
Yaaic - Yet Another Android IRC Client

Copyright 2009-2013 Sebastian Kaspari

This file is part of Yaaic.

Yaaic is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Yaaic is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Yaaic.  If not, see <http://www.gnu.org/licenses/>.
 */
package indrora.atomic.command.handler;

import indrora.atomic.command.BaseHandler;
import indrora.atomic.exception.CommandException;
import indrora.atomic.irc.IRCService;
import indrora.atomic.model.Conversation;
import indrora.atomic.model.Server;

import indrora.atomic.R;

import android.content.Context;

/**
 * Command: /whois <nickname>
 * 
 * Get information about a user
 * 
 * @author Sebastian Kaspari <sebastian@yaaic.org>
 */
public class WhoisHandler extends BaseHandler
{
    /**
     * Execute /whois
     */
    @Override
    public void execute(String[] params, Server server, Conversation conversation, IRCService service) throws CommandException
    {
        if (params.length != 2) {
            throw new CommandException(service.getString(R.string.invalid_number_of_params));
        }

        service.getConnection(server.getId()).sendRawLineViaQueue("WHOIS " + params[1]);
    }

    /**
     * Get description of /whois
     */
    @Override
    public String getDescription(Context context)
    {
        return context.getString(R.string.command_desc_whois);
    }

    /**
     * Get usage of /whois
     */
    @Override
    public String getUsage()
    {
        return "/whois <nickname>";
    }
}
