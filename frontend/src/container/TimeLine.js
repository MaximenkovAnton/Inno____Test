import React, { Component } from 'react'
import '../App.css'
import axios from 'axios'
import moment from 'moment'
import Timeline from 'react-calendar-timeline'
import generateFakeData from './generate-fake-data'


var keys = {
    groupIdKey: 'id',
    groupTitleKey: 'title',
    groupRightTitleKey: 'rightTitle',
    itemIdKey: 'id',
    itemTitleKey: 'title',
    itemDivTitleKey: 'title',
    itemGroupKey: 'group',
    itemTimeStartKey: 'start',
    itemTimeEndKey: 'end'
}

export default class TimeLine extends Timeline {
    constructor(props) {
        super(props)

        const { groups, items } = generateFakeData()
        const defaultTimeStart = moment()
            .startOf('day')
            .toDate()
        const defaultTimeEnd = moment()
            .startOf('day')
            .add(1, 'day')
            .toDate()

        this.state = {
            groups,
            items,
            defaultTimeStart,
            defaultTimeEnd
        }
    }

    render() {
        const { groups, items, defaultTimeStart, defaultTimeEnd } = this.state

        return (
            <Timeline
                groups={groups}
                items={items}
                keys={keys}
                sidebarContent={<div>Above The Left</div>}
                itemsSorted
                itemTouchSendsClick={false}
                stackItems
                itemHeightRatio={0.75}
                showCursorLine
                canMove={false}
                canResize={false}
                defaultTimeStart={defaultTimeStart}
                defaultTimeEnd={defaultTimeEnd}
            />
        )
    }
}
