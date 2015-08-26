/**
 * Activiti app component part of the Activiti project
 * Copyright 2005-2015 Alfresco Software, Ltd. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package com.activiti.model.editor;

import java.util.ArrayList;
import java.util.List;

import com.activiti.model.common.AbstractRepresentation;


public class EditorValuesRepresentation extends AbstractRepresentation {

    protected List<FormFieldValuesRepresentation> formFieldValues = new ArrayList<FormFieldValuesRepresentation>();
    protected List<OutcomeValuesRepresentation> outcomeValues = new ArrayList<OutcomeValuesRepresentation>();
    
    public List<FormFieldValuesRepresentation> getFormFieldValues() {
        return formFieldValues;
    }
    public void setFormFieldValues(
            List<FormFieldValuesRepresentation> formFieldValues) {
        this.formFieldValues = formFieldValues;
    }
    public List<OutcomeValuesRepresentation> getOutcomeValues() {
        return outcomeValues;
    }
    public void setOutcomeValues(List<OutcomeValuesRepresentation> outcomeValues) {
        this.outcomeValues = outcomeValues;
    }
}
