<div class="object-table">
	<div class="filter"><span class="title">Filter</span> <input class="form-control" type="text" ng-model="searchtext"></div>
	<table class="table table-hover table-bordered">
		<thead>
			<tr>
				<th>No.</th>
				<th ng-repeat="col in header">{{col.name}}</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<tr class="table-row" ng-repeat="row in data | filter : searchtext">
				<td class="order">{{$index+1}}</td>
				<td class="table-column" ng-repeat="col in header">
					<span ng-if="!row.newrow && !row.editable">{{row[col.id]}}</span>
					<input ng-if="row.newrow || row.editable" class="form-control" type="text" ng-model="row[col.id]">
				</td>
				<td class="control">
					<i class="fa fa-pencil" ng-if="!row.newrow && !row.editable" ng-click="editRow($index)"></i>
					<i class="fa fa-trash-o" ng-if="!row.newrow && !row.editable" ng-click="deleteRow($index)"></i>
					<i class="fa fa-floppy-o" ng-if="row.newrow || row.editable" ng-click="saveNew($index)"></i>
				</td>
			</tr>
			
		</tbody>
	</table>
	<div class="add-new"><span class="text" ng-click="addNew()">Add new</span> <i class="fa fa-plus-square-o" ng-click="addNew()"></i></div>
</div>