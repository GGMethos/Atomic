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
package indrora.atomic.exception;

/**
 * A ValidationException is thrown if any user input is invalid
 * 
 * @author Sebastian Kaspari
 */
public class ValidationException extends Exception
{
    private static final long serialVersionUID = 6951535205062761539L;

    /**
     * Create a new ValidationException with the given message
     * 
     * @param message The error message
     */
    public ValidationException(String message)
    {
        super(message);
    }
}
