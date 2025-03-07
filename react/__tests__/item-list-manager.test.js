"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var React = require("react");
var react_1 = require("@testing-library/react");
require("@testing-library/jest-dom");
var item_list_manager_1 = require("../src/item-list-manager");
describe('ItemListManager', function () {
    it('renders first test', function () {
        (0, react_1.render)(<item_list_manager_1.default />);
        expect(react_1.screen.getByText(/first test/i)).toBeInTheDocument();
    });
});
